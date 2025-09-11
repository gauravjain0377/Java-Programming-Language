public class UpdateIthBit {

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //   return  clearIthBit(n, i);
        // } else {
        //    return setIthBit(n, i);
        // }

        int n = clearIthBit(n, i);
        int BitMask = newBit << i;
        
    }
    public static void main(String[] args) {
        
    }
}
