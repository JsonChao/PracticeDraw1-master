package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint();
    private Path path = new Path();
    private int space = 10;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.FILL);

        //绘制饼图对应的文字及折线
        paint.setTextSize(25);
        paint.setColor(Color.WHITE);

        canvas.drawText("Lollipop", 10, 30, paint);
        float[] lines1 = {110, 45, 200, 45, 200, 45, 250, 80};
        canvas.drawLines(lines1, paint);

        canvas.drawText("Kitkat", 50, 400, paint);
        float[] lines2 = {150, 450, 300, 450, 300, 450, 350, 400};
        canvas.drawLines(lines2, paint);

        canvas.drawText("Marshmallow", 650, 140, paint);
        float[] lines3 = {480, 200, 570, 160, 570, 160, 640, 155};
        canvas.drawLines(lines3, paint);

        canvas.drawText("Froyo", 650, 250, paint);
        float[] lines4 = {550, 260, 640, 260};
        canvas.drawLines(lines4, paint);

        canvas.drawText("Gingerbread", 650, 290, paint);
        float[] lines5 = {540, 280, 590, 280, 590, 280, 610, 300, 610, 300, 640, 300};
        canvas.drawLines(lines5, paint);

        canvas.drawText("Ice Cream Sandwich", 650, 320, paint);
        float[] lines6 = {530, 320, 590, 320, 590, 320, 610, 340, 610, 340, 640, 340};
        canvas.drawLines(lines6, paint);

        canvas.drawText("Jelly Bean", 650, 380, paint);
        float[] lines7 = {500, 370, 570, 390, 570, 390, 640, 390};
        canvas.drawLines(lines7, paint);

        //绘制饼图
        paint.setColor(Color.RED);
        canvas.drawArc(150, 40, 550, 440, -180, 120, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(150 + space, 40 + space, 550 + space, 440 + space, -55 , 54, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(150 + space, 40 + space, 550 + space, 440 + space, -185, -105, true, paint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(150 + space, 40 + space, 550 + space, 440 + space, -283, -45, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(150 + space, 40 + space, 550 + space, 440 + space, -330 , -12, true, paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(150 + space, 40 + space, 550 + space, 440 + space, -343, -16, true, paint);

        //绘制饼图文字
        paint.setTextSize(50);
        paint.setColor(Color.WHITE);
        canvas.drawText("饼图", 330, 560, paint);
    }
}
