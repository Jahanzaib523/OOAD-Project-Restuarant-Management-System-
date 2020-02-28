
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
			Scene scene = new Scene(root,  1000, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
			primaryStage.setTitle("Restaurant Management System");
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
