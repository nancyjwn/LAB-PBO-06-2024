package profileapp.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileScene {
    private Stage stage;
    private String username, birthday, lokasi, biodata, jenis;

    public ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getBiodata() {
        return biodata;
    }

    public void setBiodata(String biodata) {
        this.biodata = biodata;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void show() {
        Label label = new Label("Your Profilee!!\n ");
        label.setFont(Font.font("System", FontWeight.BOLD, 30));
        label.setTextFill(Color.ORANGE);
        label.setAlignment(Pos.CENTER);

        Image propil = new Image("image/Crow babies.jpg");
        ImageView proView = new ImageView(propil);
        proView.setFitHeight(160);
        proView.setFitWidth(160);

        VBox gambar = new VBox(proView);
        gambar.setPadding(new Insets(0, 20, 0, 60));
        gambar.setAlignment(Pos.CENTER_RIGHT);

        Button btnNamw = new Button("Welcome " + username);
        btnNamw.setPrefWidth(300);
        btnNamw.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(20), null)));
        btnNamw.setTextFill(Color.ORANGE);
        btnNamw.setOnAction(null);

        Button btnBirth = new Button("Your Birthday " + birthday);
        btnBirth.setPrefWidth(300);
        btnBirth.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(20), null)));
        btnBirth.setTextFill(Color.ORANGE);
        btnBirth.setOnAction(null);

        Button btnJenis = new Button("Gender " + jenis);
        btnJenis.setPrefWidth(130);
        btnJenis.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(20), null)));
        btnJenis.setTextFill(Color.ORANGE);
        btnJenis.setOnAction(null);

        Button btnLokasi = new Button("From " + lokasi);
        btnLokasi.setPrefWidth(150);
        btnLokasi.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(20), null)));
        btnLokasi.setTextFill(Color.ORANGE);
        btnLokasi.setOnAction(null);

        Button btnBio = new Button(biodata);
        btnBio.setPrefWidth(300);
        btnBio.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(20), null)));
        btnBio.setTextFill(Color.ORANGE);
        btnBio.setOnAction(null);

        VBox vBoxLeft = new VBox(btnNamw, btnBirth, btnBio, btnJenis, btnLokasi);
        vBoxLeft.setSpacing(28);

        HBox gabung = new HBox(btnJenis, btnLokasi);
        gabung.setAlignment(Pos.CENTER_LEFT);

        HBox kirimen = new HBox(vBoxLeft, gambar);

        Button btnBack = new Button("Back");
        btnBack.setPrefWidth(50);
        btnBack.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(10), null)));
        btnBack.setTextFill(Color.ORANGE);
        btnBack.setOnAction(e -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        HBox back = new HBox(btnBack);
        back.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox mainView = new VBox(label,kirimen, gabung, back);
        mainView.setSpacing(0);
        mainView.setPadding(new Insets(30));
        stage.getScene().setRoot(mainView);
    }
}
