import org.junit.*;
import static org.junit.Assert.*;

public class UnitTests {
    
    MainPanel mainPanel;

    public UnitTests() {
        mainPanel = new MainPanel();
    }

    @Test
    public void testPause() {
        mainPanel.pause();
        for(int i = 0; i < mainPanel.getLength(); i++){
            assertFalse(mainPanel.buttons[i].isEnabled());        
        }
    }
}
