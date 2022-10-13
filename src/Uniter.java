
class Uniter{
     public static void main(String[]args){
        // calls the welcome class, used by calling the welcome object
        welcomer welcomerObject = new welcomer();
        welcomerObject.welcome();
        // very similar to above, but using the menu class
        menu menuObject = new menu();
        menuObject.showmenu();
        //math mathObject = new math();
     }
}