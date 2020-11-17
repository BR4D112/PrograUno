package Models;

public class Models{

    public int convertAndOperate(int initHours, int initMin, int initSec, int finalHours, int finalMin, int finalSec){
        return ((initHours * 3600) + (initMin * 60) + (initSec)) - ((finalHours * 3600) + (finalMin * 60) + (finalSec));
    }
}
