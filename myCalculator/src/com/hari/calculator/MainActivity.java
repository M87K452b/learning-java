package com.hari.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public String number;
	public double num,answer;
	int Operation;
	public Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,clr,eqls,sqr,sqrt,dot;
	public TextView display;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		number="";
		num=0;
		answer=0;
				
		one = (Button)findViewById(R.id.bOne);
		two = (Button)findViewById(R.id.bTwo);
		three = (Button)findViewById(R.id.bThree);
		four = (Button)findViewById(R.id.bFour);
		five = (Button)findViewById(R.id.bFive);
		six = (Button)findViewById(R.id.bSix);
		seven = (Button)findViewById(R.id.bSeven);
		eight = (Button)findViewById(R.id.bEight);
		nine = (Button)findViewById(R.id.bNine);
		zero = (Button)findViewById(R.id.bZero);
		dot = (Button)findViewById(R.id.bDot);
		add = (Button)findViewById(R.id.bAdd);
		sub = (Button)findViewById(R.id.bSub);
		mul = (Button)findViewById(R.id.bMultiply);
		div = (Button)findViewById(R.id.bDivide);
		sqr = (Button)findViewById(R.id.bSqr);
		sqrt = (Button)findViewById(R.id.bSqrt);
		clr = (Button)findViewById(R.id.bClear);
		eqls = (Button)findViewById(R.id.bEquals);
		display = (TextView)findViewById(R.id.txtDisplay);
		
		one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"1";
				display.setText(""+number);
			}
		});
		two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"2";
				display.setText(""+number);
			}
		});
		three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"3";
				display.setText(""+number);
			}
		});
		four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"4";
				display.setText(""+number);
			}
		});
		five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"5";
				display.setText(""+number);
			}
		});
		six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"6";
				display.setText(""+number);
			}
		});
		seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"7";
				display.setText(""+number);
			}
		});
		eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"8";
				display.setText(""+number);
			}
		});
		nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"9";
				display.setText(""+number);
			}
		});
		zero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+"0";
				display.setText(""+number);
			}
		});
		dot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number=number+".";
				display.setText(""+number);
			}
		});
		
		clr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				number="";
				num=0;
				answer=0;
				display.setText("");
			}
		});
	
		sqr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
					
				double numBefore = Double.valueOf(number);
				answer=Math.pow(numBefore, 2);
				display.setText(""+answer);
				number=String.valueOf(answer);
				
					
			}
		});
		sqrt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				double numBefore = Double.valueOf(number);
				answer=Math.sqrt(numBefore);
				display.setText(""+answer);
				number=String.valueOf(answer);
					
			}
		});
		
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double num = Double.valueOf(number);
				number="";
				answer+=num;
				display.setText(""+answer);
				
			}
		});
		
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double num = Double.valueOf(number);
				if(answer==0){
					int x=0;
					while(x<1){
					answer=num-answer;
					x++;
					}
				}else{
				answer=answer-num;
				number="";
				}
				display.setText(""+answer);
				 
					
			}
		});
		mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double num = Double.valueOf(number);
				if(answer==0){
					answer++;
					answer*=num;
				}else{
				answer*=num;
				}
				display.setText(""+answer);
				number="";
					
			}
		});
		div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double num = Double.valueOf(number);
				if(answer==0){
					answer++;
					answer=num;
				}else{
					answer=answer/num;
				}
				display.setText(""+answer);
				number="";
					
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
