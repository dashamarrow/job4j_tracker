package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StartUITest {
   @Test
   public void whenCreateItem() {
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[] {"0", "Item name", "1"}
      );
      Tracker tracker = new Tracker();
      UserAction[] actions = {
              new CreateAction(out),
              new Exit(out)
      };
      new StartUI(out).init(in, tracker, actions);
      assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
   }

   @Test
   public void whenEditItem() {
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("Replaced item"));
      String editedName = "New item name";
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[] {"0", String.valueOf(item.getId()), editedName, "1"}
      );
      UserAction[] actions = {
              new EditAction(out),
              new Exit(out)
      };
      new StartUI(out).init(in, tracker, actions);
      assertThat(tracker.findById(item.getId()).getName()).isEqualTo(editedName);
   }

   @Test
   public void whenDeleteItem() {
      Tracker tracker = new Tracker();
      Item item = tracker.add(new Item("Deleted item"));
      Output out = new StubOutput();
      Input in = new StubInput(
              new String[] {"0", String.valueOf(item.getId()), "1"}
      );
      UserAction[] actions = {
              new DeleteAction(out),
              new Exit(out)
      };
      new StartUI(out).init(in, tracker, actions);
      assertThat(tracker.findById(item.getId())).isNull();
   }
}