public class Q67AddBinary {
    public void test(){

        String a = "11", b = "1";
        String c = "1010", d = "1011";

        System.out.println(addBinary(a,b));
        System.out.println(addBinary(c,d));
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        int flag = 0;

        while(aIndex>=0 && bIndex >=0){
            if((Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + flag)==0){
//                int k = Character.getNumericValue(a.charAt(aIndex));
                res.insert(0,'0');
                flag = 0;
            }else if((Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + flag)==1){
                res.insert(0,'1');
                flag = 0;
            }else if((Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + flag)==2){
                res.insert(0,'0');
                flag = 1;
            }else if((Character.getNumericValue(a.charAt(aIndex)) + Character.getNumericValue(b.charAt(bIndex)) + flag)==3){
                res.insert(0,'1');
                flag = 1;
            }
            aIndex--;
            bIndex--;
        }

        if(aIndex<0){
            while(bIndex>=0){
                if((Character.getNumericValue(b.charAt(bIndex)) + flag)==0){
                    res.insert(0,'0');
                    flag = 0;
                }else if((Character.getNumericValue(b.charAt(bIndex)) + flag)==1){
                    res.insert(0,'1');
                    flag = 0;
                }else if((Character.getNumericValue(b.charAt(bIndex)) + flag)==2){
                    res.insert(0,'0');
                    flag = 1;
                }
                bIndex--;
            }
        }

        if(bIndex<0){
            while(aIndex>=0){
                if((Character.getNumericValue(a.charAt(aIndex)) + flag)==0){
                    res.insert(0,'0');
                    flag = 0;
                }else if((Character.getNumericValue(a.charAt(aIndex)) + flag)==1){
                    res.insert(0,'1');
                    flag = 0;
                }else if((Character.getNumericValue(a.charAt(aIndex)) + flag)==2){
                    res.insert(0,'0');
                    flag = 1;
                }
                aIndex--;
            }
        }

        if(flag==1){
            res.insert(0,'1');
        }

        return res.toString();
    }
}
