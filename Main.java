class Main{ 
    public static void main(String[] args) {
        // Sci-fi first name
        //String scifif_name = f_name.substring(0, 4) + l_name.substring(0, 3); 
        
        // Sci-fi place of origin 
        String relatives = "hello"; 
        String relatives2 = "goodbye"; 
        int rand_num = (int)(Math.random() + (relatives.length()- 1)); 
        String firstR_last = relatives.substring(rand_num);
        
        String secondR_last = relatives2.substring(rand_num); 
        
        System.out.println(firstR_last); 
        System.out.println(secondR_last); 
    
    }
}