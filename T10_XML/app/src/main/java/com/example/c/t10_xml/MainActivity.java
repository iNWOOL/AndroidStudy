package com.example.c.t10_xml;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tv1);
        MyPullParser mpp = new MyPullParser(textView);
        mpp.execute("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2817061000");
        //MyDomParserTask task = new MyDomParserTask(textView);
        //task.execute("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2817061000");

    }
}
