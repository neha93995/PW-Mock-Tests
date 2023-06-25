public class Question2 {

    public static int nonRepeatingChar(String str){

        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        boolean isRepeat =false;
        for(int i=0; i<ch.length-1; i++)
        {
            isRepeat=false;
            if(i>0 && ch[i]==ch[i-1])
            {
                continue;
            }
            for(int j=i+1; j<ch.length; j++)
            {
                System.out.println(ch[i]+" "+ ch[j]);
                if(ch[i]==ch[j])
                {
                    isRepeat =true;
                }
            }
            if(!isRepeat)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {


        String str = "aabb";
        int index = nonRepeatingChar(str);

        System.out.println("first non repeating element is present on index : " +index);
    }

}
