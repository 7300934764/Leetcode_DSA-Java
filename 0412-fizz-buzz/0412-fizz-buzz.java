class Solution {
    public List<String> fizzBuzz(int n) {
      List<String> mp=new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            mp.add("FizzBuzz");
        }
        else if(i%3==0){
            mp.add("Fizz");
        }
        else if(i%5==0){
            mp.add("Buzz");
        }
        else{
            mp.add(i+"");
        }
       }
        return mp;
    }
}