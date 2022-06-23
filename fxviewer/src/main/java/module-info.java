module top.lt623tl.printercommandviewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.lt623tl.printercommandviewer to javafx.fxml;
    exports top.lt623tl.printercommandviewer;
}