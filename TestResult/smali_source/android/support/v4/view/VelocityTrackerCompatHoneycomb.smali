.class Landroid/support/v4/view/VelocityTrackerCompatHoneycomb;
.super Ljava/lang/Object;
.source "VelocityTrackerCompatHoneycomb.java"


# direct methods
.method public static getXVelocity(Landroid/view/VelocityTracker;I)F
    .registers 3
    .param p0, "tracker"    # Landroid/view/VelocityTracker;
    .param p1, "pointerId"    # I

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    return v0
.end method

.method public static getYVelocity(Landroid/view/VelocityTracker;I)F
    .registers 3
    .param p0, "tracker"    # Landroid/view/VelocityTracker;
    .param p1, "pointerId"    # I

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v0

    return v0
.end method