module com.example.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.olamundojavafx to javafx.fxml;
    exports com.example.olamundojavafx;
}