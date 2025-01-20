package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mohamedrejeb.compose.dnd.DragAndDropState
import com.mohamedrejeb.compose.dnd.drag.DraggableItem
data class DraggableCircle(
    val id: Int,
    val color: Color
)

@Composable
fun DraggableCircles(
    circles: List<DraggableCircle>,
    dragAndDropState: DragAndDropState<Color>
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        circles.forEach { circle ->
            DraggableItem(
                state = dragAndDropState,
                key = circle.id,
                data = circle.color
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(circle.color, CircleShape)
                )
            }
        }
    }
}

