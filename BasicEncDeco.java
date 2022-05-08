import java.util.Base64;

class BasicEncDeco{

  public static void main(String[] args){
    Base64.Encoder encoder = Base64.getEncoder();
    byte arr1[] = { 10, 21 };
    byte arr2[] = encoder.encode(arr1);
    System.out.println(arr2);

    byte arr3[] = new byte[10];
    int a = encoder.encode(arr1, arr3);
    System.out.println(a);

    //Encode string
    String s = encoder.encodeToString("Java".getBytes());
    System.out.println("Encoded:"+s);

    //Decode
    Base64.Decoder decoder = Base64.getDecoder();
    String d = new String(decoder.decode(s));
    System.out.println("Decoded:"+d);

    //Url encode

    String url = encoder.encodeToString("https://www.google.com/".getBytes());
    System.out.println("Encoded Url:"+ url);

    String durl = new String(decoder.decode(url));
    System.out.println("Decoded:"+durl);

    //Mime
    Base64.Encoder mencoder = Base64.getMimeEncoder();
    String txt = mencoder.encodeToString("Hello\nYou are Java dev".getBytes());
    System.out.println("Encoded Url:"+ txt);

    Base64.Decoder mdecoder = Base64.getMimeDecoder();
    String ddecoder = new String(mdecoder.decode(txt));
    System.out.println("Decoded:"+ddecoder);

  }
}