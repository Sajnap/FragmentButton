package com.example.frgmentbutton;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if(savedInstanceState==null){
			getSupportFragmentManager()
			.beginTransaction()
			.add(R.id.container,new MyFragment1())
			.commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		removePreviousFragments();
		switch(item.getItemId()){
		case R.id.fragment1:
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container,new MyFragment1())
			.commit();
			return true;
		case R.id.fragment2:
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container,new MyFragment2())
			.commit();
			return true;
		case R.id.fragment3:
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container,new MyFragment3())
			.commit();
			return true;
		case R.id.fragment4:
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container,new MyFragment4())
			.commit();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	public static class MyFragment1 extends Fragment
	{
		public MyFragment1()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_1,container,false);
			return rootView;
		}

	}
	public static class MyFragment2 extends Fragment
	{
		public MyFragment2()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_2,container,false);
			return rootView;
		}

	}
	public static class MyFragment3 extends Fragment
	{
		public MyFragment3()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_3,container,false);
			return rootView;
		}

	}
	public static class MyFragment4 extends Fragment
	{
		public MyFragment4()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_4,container,false);
			return rootView;
		}

	}
	private void removePreviousFragments() {
		// TODO Auto-generated method stub
		ArrayList<Fragment> al=new ArrayList<Fragment>(getSupportFragmentManager().getFragments());
		if(al==null)
		{

		}
		for(Fragment frag:al)
		{
			getSupportFragmentManager().beginTransaction().remove(frag).commit();
		}
	}
}
