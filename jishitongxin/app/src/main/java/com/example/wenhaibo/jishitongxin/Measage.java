package com.example.wenhaibo.jishitongxin;

/**
 * Created by wenhaibo on 2017/11/18.
 */

public class Measage {
    public static  final int TYPE_RECEIVED=0; //消息类型  接受

    public static  final int TYPE_SEND=1; //消息类型  发送

    private String content;//消息的内容
    private int type;//消息的类型


    public Measage(String content, int type){
        this.content=content;
        this.type=type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }





}
