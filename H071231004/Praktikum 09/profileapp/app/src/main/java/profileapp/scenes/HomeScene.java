package profileapp.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label = new Label("Welcomee Welcomee!!\n ");
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 30));
        label.setTextFill(Color.ORANGE);

        Label labelName = new Label("Name       : ");
        Label labelBirt = new Label("Birthday   : ");
        Label labelAsal = new Label("From        : ");
        Label labelBio = new Label("Kata Hati  : ");
        Label labelGender = new Label("Gender   :");
        VBox vBoxLeft = new VBox(labelName, labelGender, labelBirt, labelAsal, labelBio);
        vBoxLeft.setSpacing(20);

        TextField textFieldUser = new TextField();
        TextField textFieldBirt = new TextField();
        TextField textFieldAsal = new TextField();
        TextField textFieldBio = new TextField();
        TextField textFieldGender = new TextField();
        VBox vBoxRight = new VBox(textFieldUser, textFieldGender, textFieldBirt, textFieldAsal, textFieldBio);
        vBoxRight.setSpacing(10);
        vBoxRight.setPrefWidth(400);

        HBox hBoxContent = new HBox(vBoxLeft, vBoxRight);
        hBoxContent.setSpacing(10);

        Button buttonLogin = new Button("Check Profile");
        buttonLogin.setPrefWidth(100);
        buttonLogin.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(10), null)));
        buttonLogin.setTextFill(Color.ORANGE);
        buttonLogin.setOnAction(e -> {
            if (textFieldUser.getText().trim().isEmpty()){
                return;
            } else {
                ProfileScene profileScene = new ProfileScene(stage);
                profileScene.setUsername(textFieldUser.getText());
                profileScene.setBirthday(textFieldBirt.getText());
                profileScene.setLokasi(textFieldAsal.getText());
                profileScene.setBiodata(textFieldBio.getText());
                profileScene.setJenis(textFieldGender.getText());
                profileScene.show();
            }
        });

        HBox btn = new HBox(buttonLogin);
        btn.setAlignment(Pos.CENTER);
        btn.setPadding(new Insets(20));

        VBox mainView = new VBox(label, hBoxContent, btn);
        mainView.setAlignment(Pos.TOP_CENTER);
        mainView.setSpacing(10);
        mainView.setPadding(new Insets(30));
        stage.getScene().setRoot(mainView);

        StackPane root = new StackPane();
        root.getChildren().addAll(mainView);
        stage.getScene().setRoot(root);
    }
}
