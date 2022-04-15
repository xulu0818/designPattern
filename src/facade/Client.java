package facade;

public class Client {

    public static void main(String[] args){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("========ready to play video========");
        homeTheaterFacade.ready();

        System.out.println("========play DVD========");
        homeTheaterFacade.play();

        System.out.println("========close the DVD===========");
        homeTheaterFacade.turnOff();

    }

}
