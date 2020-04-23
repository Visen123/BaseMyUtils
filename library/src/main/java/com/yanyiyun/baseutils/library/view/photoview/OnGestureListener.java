package com.yanyiyun.baseutils.library.view.photoview;

public interface OnGestureListener {

    void onDrag(float dx,float dy);

    void onFling(float startX,float startY, float velocityX,float velocityY);

    void onScale(float scaleFactor,float focusX,float focusY);
}
