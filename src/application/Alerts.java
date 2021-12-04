package application;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Alerts {

	public static void showAlert(String titulo, String header, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}
