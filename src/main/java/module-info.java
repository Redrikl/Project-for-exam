module com.example.projectteorver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.projectteorver to javafx.fxml;
    exports com.example.projectteorver;
}