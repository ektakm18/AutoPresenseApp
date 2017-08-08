package com.m2e.cs5540.autopresence.professors;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.m2e.cs5540.autopresence.R;
import com.m2e.cs5540.autopresence.context.AppContext;
import com.m2e.cs5540.autopresence.students.StudentAttendanceActivity;

/**
 * Created by Kumar on 8/5/2017.
 */

public class ProfessorViewHolder extends RecyclerView.ViewHolder
      implements View.OnClickListener {
   private static final String TAG = "ProfessorViewHolder";
   private TextView courseIdText;
   private TextView courseNameText;
   private TextView courseLocationText;
   private TextView courseDateText;
   private TextView courseTimeText;
   private TextView courseDayText;

   public ProfessorViewHolder(View itemView) {
      super(itemView);
      courseIdText = (TextView) itemView.findViewById(R.id.professorCourseId);
      courseNameText = (TextView) itemView.findViewById(R.id.professorCourseName);
      courseLocationText = (TextView) itemView.findViewById(
              R.id.professorCourseLocation);
      courseDateText = (TextView) itemView.findViewById(R.id.professorCourseDate);
      courseTimeText = (TextView) itemView.findViewById(R.id.professorCourseTime);
      courseDayText = (TextView) itemView.findViewById(R.id.professorCourseDay);
      itemView.setOnClickListener(this);
   }

   @Override public void onClick(View view) {
      if (view != null) {
         Intent intent = new Intent(view.getContext(), ProfessorAttendanceActivity.class);
         intent.putExtra("courseId", courseIdText.getText());
         intent.putExtra("userId",
                 AppContext.getCurrentAppContext().getUser().getId());
         view.getContext().startActivity(intent);
      } else {
         Log.i(TAG, "$$$ Null view in ProfessorViewHolder.onClick");
      }
   }

   public void setCourseIdText(String courseIdText) {
      this.courseIdText.setText(courseIdText);
   }

   public void setCourseNameText(String courseNameText) {
      this.courseNameText.setText(courseNameText);
   }

   public void setCourseLocationText(String courseLocationText) {
      this.courseLocationText.setText(courseLocationText);
   }

   public void setCourseDateText(String courseDateText) {
      this.courseDateText.setText(courseDateText);
   }

   public void setCourseTimeText(String courseTimeText) {

      this.courseTimeText.setText(courseTimeText);
   }

   public void setCourseDayText(String courseDayText) {

      this.courseDayText.setText(courseDayText);
   }
}
