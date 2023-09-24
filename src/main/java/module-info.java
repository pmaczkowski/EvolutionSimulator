module pl.java.evolutionsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens pl.java.evolutionsimulator to javafx.fxml;
    exports pl.java.evolutionsimulator;
}