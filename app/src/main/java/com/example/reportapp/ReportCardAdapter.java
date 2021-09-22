package com.example.reportapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

class ReportCardAdapter extends RecyclerView.Adapter<ReportCardAdapter.MyViewHolder> {

    private List<ReportCardModel> listReportCard;

    ReportCardAdapter(List<ReportCardModel> reportCardList) {
        this.listReportCard = reportCardList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inflater_data, parent, false));
    }

    @Override
    public void onBindViewHolder(ReportCardAdapter.MyViewHolder holder, int position) {
        ReportCardModel reportCardModel = listReportCard.get(position);

        holder.mSubjectName.setText(reportCardModel.getSubjectName());
        holder.mSubjectMark.setText(String.valueOf(reportCardModel.getSubjectMarks()));
        holder.mSubjectGrade.setText(String.valueOf(reportCardModel.getSubjectGrade()));

    }

    @Override
    public int getItemCount() {
        return listReportCard.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView mSubjectIcon;
        private TextView_Lato mSubjectName;
        private TextView_lato_thin mSubjectMark;
        private TextView_lato_thin mSubjectGrade;


        public MyViewHolder(View itemView) {
            super(itemView);
            mSubjectIcon = (CircleImageView) itemView.findViewById(R.id.subject_image);
            mSubjectName = (TextView_Lato) itemView.findViewById(R.id.subject_name);
            mSubjectMark = (TextView_lato_thin) itemView.findViewById(R.id.subject_mark);
            mSubjectGrade = (TextView_lato_thin) itemView.findViewById(R.id.subject_grade);

        }
    }
}
