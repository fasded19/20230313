import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class InputPanel extends HBox{
    Label label = new Label();
    TextField field;
    public InputPanel(){
        this.initComponent();
        this.addComponent();
    }
    private void initComponent(){
        this.label=new Label();
        this.field=new TextField();
        this.label.setMinWidth(100);
        HBox.setMargin(this.label, new Insets(10,10,10,10));
        this.label.setAlignment(Pos.CENTER_RIGHT);

    }
    private void addComponent() {
        this.getChildren().add(this.label);
        this.getChildren().add(this.field);
    }
    public void setText(){
        this.label.getText();
    }
    public String getText() {
        return this.label.getText();
    }
    public void setValue(String text) {
        this.field.setText(text);        
    }
    public String getValue() {
        return this.field.getText();
    }
}
