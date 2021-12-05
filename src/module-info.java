module crudJavafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;
	requires mysql.connector.java;
	//requires mysql.connector.java;
	
	//exports javafx.fxml to gui;
	//javafx.exports;
	exports gui to javafx.fxml;
	opens gui to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
	//exports model.entities to javafx.fxml;
	opens model.entities to javafx.fxml, javafx.base;
}
