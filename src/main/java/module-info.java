module com.lesson.bank_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires spring.context;

    //exports com.lesson.bank_system;
    opens com.lesson.bank to javafx.fxml;
    exports com.lesson.bank.server;
    opens com.lesson.bank.server to javafx.fxml;
    exports com.lesson.bank.client;
    opens com.lesson.bank.client to javafx.fxml;
    //exports com.lesson.bank_system.interface_tools;
    //opens com.lesson.bank_system.interface_tools to javafx.fxml;
    exports com.lesson.bank;
}