package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea textfelt;
    double firstnumber = 0;
    int operator = -1;
    public void numberchange(int number) {
        switch (number) {
            case 1: textfelt.appendText( "1");break;
            case 2: textfelt.appendText( "2");break;
            case 3: textfelt.appendText( "3");break;
            case 4: textfelt.appendText( "4");break;
            case 5: textfelt.appendText( "5");break;
            case 6: textfelt.appendText( "6");break;
            case 7: textfelt.appendText( "7");break;
            case 8: textfelt.appendText( "8");break;
            case 9: textfelt.appendText( "9");break;
            case 0: textfelt.appendText( "0");break;
            default: System.out.println("error");
        }
    }
    public void storenumber(){
        firstnumber = Double.parseDouble(textfelt.getText());
        textfelt.clear();
    }
    public void button1(){ numberchange(1);
    }
    public void button2(){ numberchange(2);
    }
    public void button3(){ numberchange(3);
    }
    public void button4(){ numberchange(4);
    }
    public void button5(){ numberchange(5);
    }
    public void button6(){ numberchange(6);
    }
    public void button7(){ numberchange(7);
    }
    public void button8(){ numberchange(8);
    }
    public void button9(){ numberchange(9);
    }
    public void button0(){ numberchange(0);
    }
    public void buttonplus(){ storenumber();operator=1;
    }
    public void buttonminus(){ storenumber();operator=2;
    }
    public void buttongange(){ storenumber();operator=3;
    }
    public void buttondivision(){ storenumber();operator=4;
    }
    public void buttonlig(){calc();
    }
    public void calc(){
        double facit=-1;
        switch (operator){
            case 1:
                facit = firstnumber+Double.parseDouble(textfelt.getText());
                break;
            case 2:
                facit = firstnumber-Double.parseDouble(textfelt.getText());
                break;
            case 3:
                facit = firstnumber*Double.parseDouble(textfelt.getText());
                break;
            case 4:
                facit = firstnumber/Double.parseDouble(textfelt.getText());
                break;
            default:
                System.out.println("ERROR");
        }
        textfelt.clear();
        textfelt.appendText(Double.toString(facit));
    }
    public void clear(){textfelt.clear();}
}
