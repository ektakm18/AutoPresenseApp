package com.m2e.cs5540.autopresence.vao;

/**
 * Created by maeswara on 7/15/2017.
 */
public class MeetingDate {
   private String startDate;
   private String endDate;
   private String startTime;
   private String endTime;
   private String meetingDays;

   public String getStartDate() {
      return startDate;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getEndDate() {
      return endDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getStartTime() {
      return startTime;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getEndTime() {
      return endTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getMeetingDays() {
      return meetingDays;
   }

   public void setMeetingDays(String meetingDays) {
      this.meetingDays = meetingDays;
   }

   @Override public String toString() {
      return "\n\t[StartDate: " + startDate + "\n\tEndDate: " + endDate +
            "\n\tStartTime: " + startTime + "\n\tEndTime: " + endTime +
            "\n\tMeetingDays: " + meetingDays + "\n]";
   }
}
