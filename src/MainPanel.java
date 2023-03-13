import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    InputPanel radiusPanel;
    InputPanel heightPanel;
    InputPanel volumePanel;
    public MainPanel() {
        this.initComponent();
        this.addComponent();
    }
    private void initComponent(){
        this.radiusPanel=new InputPanel();
        this.heightPanel=new InputPanel();
        this.volumePanel=new InputPanel();

        this.TitlePanel.setText();
        this.radiusPanel.setText();
        this.heightPanel.setText();
        this.volumePanel.setText();
    }
    private void addComponent(){
        this.getChildren().add(this.radiusPanel);
        this.getChildren().add(this.heightPanel);
        this.getChildren().add(this.volumePanel);
    }
    private void setMainpanel(){
        this.setAlignment(Pos.CENTER);
    }
}