import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane context;

    public void initialize() throws IOException {
        setUi("WindowOneForm");
    }

    public void openWindowOnAction(ActionEvent event) throws IOException {
        setUi("WindowOneForm");
    }

    public void openTwoOnAction(ActionEvent event) throws IOException {
        setUi("WindowTwoForm");
    }
    private void setUi(String location) throws IOException {
        context.getChildren().clear();
        context.getChildren().add(FXMLLoader.load(getClass().getResource(location+".fxml")));
    }
}
