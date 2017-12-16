package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();
    private float barValue = 115f;
    private int barHeight;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setStrokeWidth(3);
        paint.setColor(Color.WHITE);

        //画坐标系
        float[] lines = {150, 50, 150, 550, 150, 550, 1000, 550};
        canvas.drawLines(lines, paint);

        //画文字
        paint.setTextSize(50);
        canvas.drawText("直方图", 475, 700, paint);

        //画X轴坐标值
        paint.setTextSize(30);
        canvas.drawText("Froyo", 190, 580, paint);
        canvas.drawText("GB", 190 + barValue, 580, paint);
        canvas.drawText("ICS", 190 + 2 * barValue, 580, paint);
        canvas.drawText("JB", 190 + 3 * barValue, 580, paint);
        canvas.drawText("KitKat", 190 + 4 * barValue, 580, paint);
        canvas.drawText("L", 190 + 5 * barValue, 580, paint);
        canvas.drawText("M", 190 + 6 * barValue, 580, paint);

        //画柱状图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        barHeight = 10;
        canvas.drawRect(170, 550 - barHeight, 270, 550, paint);
        barHeight = 50;
        canvas.drawRect(170 + barValue, 550 - barHeight, 270 + barValue, 550, paint);
        canvas.drawRect(170 + 2 * barValue, 550 - barHeight, 270 + 2 * barValue, 550 , paint);
        barHeight = 250;
        canvas.drawRect(170 + 3 * barValue, 550 - barHeight, 270 + 3 * barValue, 550, paint);
        barHeight = 350;
        canvas.drawRect(170 + 4 * barValue, 550 - barHeight, 270 + 4 * barValue, 550, paint);
        barHeight = 450;
        canvas.drawRect(170 + 5 * barValue, 550 - barHeight, 270 + 5 * barValue, 550, paint);
        barHeight = 200;
        canvas.drawRect(170 + 6 * barValue, 550 - barHeight, 270 + 6 * barValue, 550, paint);
    }
}
