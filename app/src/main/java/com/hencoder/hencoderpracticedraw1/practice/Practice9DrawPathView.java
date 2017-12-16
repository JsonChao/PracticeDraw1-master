package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint paint;
    private Path path;
    private Path path1;

    public Practice9DrawPathView(Context context) {
        super(context);
        paint = new Paint();
        path = new Path();
        path1 = new Path();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        path = new Path();
        path1 = new Path();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        path = new Path();
        path1 = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.FILL);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            path.addArc(250, 250, 350, 350, -225, 225);
            path.arcTo(350, 250, 450, 350, -180, 225, false);
        } else {
            RectF rect = new RectF(250, 250, 350, 350);
            path.addArc(rect, -225, 225);
            RectF rectF = new RectF(350, 250, 450, 350);
            path.arcTo(rectF, -180, 225, false);
        }

        path.lineTo(350, 420);
        canvas.drawPath(path, paint);

    }
}
