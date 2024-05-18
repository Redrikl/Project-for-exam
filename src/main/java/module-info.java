module com.example.projectteorver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires org.apache.poi.ooxml;

    opens com.example.projectteorver to javafx.fxml;
    exports com.example.projectteorver;
}