public class Ex2_Inheritance_used {
    class ClassName {
        protected String Sound = "Sound";
        public void Sound_of_massage() {
            System.out.println("Pilic-pilic!");
        }
    }
    class Message extends ClassName {
        private String TextOfMessage = "New massage";
        public void main(String[] args) {
            //create new object
            Message myNewMessage = new Message();
            //call the sound of message() method (from Sound class) on the object the myNewMessage object
            myNewMessage.Sound_of_massage();
            // Display the value of the Sound attribute (from ClassName class) and the value of the TextOfMessage from Message class
            System.out.println(myNewMessage.Sound + " "+ myNewMessage.TextOfMessage);
        }
    }

}
