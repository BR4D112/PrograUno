package controller;

import MODELS.Time;
import views.IOManager;

public class Controller {
    IOManager io = new IOManager();
    Time ti = new Time();

    public void init() {
        int hours = io.getHours("Ingrese las horas");
        int minutes = io.getMinutes("Ingrese los minutos");
        int seconds = io.getSeconds("Ingrese los segundos");
        int total= ti.totalRest(ti.hoursToSeconds(hours), ti.minutesToSeconds(minutes), seconds, io.getHours("ingrese la segunda hora"), io.getMinutes("ingrese los siguientes minutos"), io.getSeconds("ingrese los siguientes segundos"));
        io.showResult("el total de diferencia es: "+total);


    }
}
