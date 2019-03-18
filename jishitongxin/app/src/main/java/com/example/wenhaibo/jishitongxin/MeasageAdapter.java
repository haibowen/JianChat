package com.example.wenhaibo.jishitongxin;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


/**
 * Created by wenhaibo on 2017/11/18.
 */

public class MeasageAdapter extends RecyclerView.Adapter<MeasageAdapter.MyViewHolder> {




    private List<Measage> measageList;
    public MeasageAdapter(List<Measage> measageList){
        this.measageList=measageList;


    }


    @Override
    public MeasageAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_msg, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MeasageAdapter.MyViewHolder holder, int position) {

        Measage measage = measageList.get(position);
        if (measage.getType() == Measage.TYPE_RECEIVED){
            holder.llLeft.setVisibility(View.VISIBLE);
            holder.llRight.setVisibility(View.GONE);
            holder.tv_Left.setText(measage.getContent());
        } else if (measage.getType() == Measage.TYPE_SEND){
            holder.llLeft.setVisibility(View.GONE);
            holder.llRight.setVisibility(View.VISIBLE);
            holder.tv_Right.setText(measage.getContent());
        }

    }

    @Override
    public int getItemCount() {
        return measageList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        LinearLayout llLeft;
        LinearLayout llRight;

        TextView tv_Left;
        TextView tv_Right;


        public MyViewHolder(View itemView) {
            super(itemView);

            llLeft = (LinearLayout) itemView.findViewById(R.id.ll_msg_left);
            llRight = (LinearLayout) itemView.findViewById(R.id.ll_msg_right);

            tv_Left = (TextView) itemView.findViewById(R.id.tv_msg_left);
            tv_Right = (TextView) itemView.findViewById(R.id.tv_msg_right);

        }
    }
}

