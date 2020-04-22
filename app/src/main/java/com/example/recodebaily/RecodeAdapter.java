package com.example.recodebaily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecodeAdapter extends BaseExpandableListAdapter {
private ArrayList<String> groupList = null;
private ArrayList<ArrayList<String>> childList = null;
private LayoutInflater inflater = null;
private ViewHolder viewHolder = null;

private int groupLayout = 0;
private int chlidLayout = 0;
private ArrayList<myGroup> DataList;

    public RecodeAdapter(Context c,ArrayList<String> groupList,
                         ArrayList<ArrayList<String>> childList){
        super();
        this.inflater = LayoutInflater.from(c);
        this.groupList = groupList;
        this.childList = childList;
    }



    public String getGroupCount(int groupPosition) {
        return groupList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return groupList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childList.get(groupPosition).size();
    }

    @Override
    public String getGroup(int groupPosition) {
        return groupList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childList.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null) {
            viewHolder = new ViewHolder();
            v = inflater.inflate(R.layout.activity_recode_list, parent, false);


        }else{
            viewHolder = (ViewHolder)v.getTag();
        }


        viewHolder.tv_groupName.setText(getGroup(groupPosition));

        return v;


    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    class ViewHolder {
        public ImageView iv_image;
        public TextView tv_groupName;
        public TextView tv_childName;
    }

}
