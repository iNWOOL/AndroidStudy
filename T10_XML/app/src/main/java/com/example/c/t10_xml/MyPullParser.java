package com.example.c.t10_xml;

import android.os.AsyncTask;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;

/**
 * Created by c on 2016-05-28.
 */
public class MyPullParser extends AsyncTask<String, Void, String> {
    public MyPullParser(TextView textView) {
        this.textView = textView;
    }

    TextView textView;
    @Override
    protected String doInBackground(String... params) {
        String res = "";
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new URL(params[0]).openStream(), "utf-8");

            int eventtype = xpp.getEventType();
            boolean bRead = false;
            while (eventtype != XmlPullParser.END_DOCUMENT){
                switch (eventtype){
                    case XmlPullParser.START_TAG:
                        if(xpp.getName().equals("hour")) {
                            res += "hour : ";
                            bRead = true;
                        }else if(xpp.getName().equals("day")){
                            res += "day : ";
                            bRead = true;
                        }else if(xpp.getName().equals("temp")) {
                            res +=  "temp : ";
                            bRead = true;
                        }else if(xpp.getName().equals("wfKor")) {
                            res +=  "wfKor : ";
                            bRead = true;
                        }

                        break;
                    case XmlPullParser.END_TAG:
                        break;
                    case XmlPullParser.TEXT:
                        if(bRead) {
                            res += xpp.getText();
                            res += "\n";
                            bRead = false;
                        }
                        break;
                }
                eventtype = xpp.next();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        textView.setText(s);
    }
}
