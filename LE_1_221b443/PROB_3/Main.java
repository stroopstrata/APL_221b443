class Mainhttps://www.onlinegdb.com/edit/vP3Olb1eZf#editor_2 {
 public static void main (String args[]){
 Mother m= new Mother ( );
 //m.show( ); // show of Mother is called
 Child ch=new Child ( ); 
 //ch. show ( ); // show ( ) inherited in Child from Mother is called
 Mother m1=new Child ( );
 m1.show();
 }
}
