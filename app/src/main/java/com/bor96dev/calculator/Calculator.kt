package com.bor96dev.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (Action) -> Unit
    ) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = MaterialTheme.colors.primaryVariant,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                    .background(MaterialTheme.colors.primarySurface)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(Action.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primarySurface)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Operation(CalculatorOperation.Divide))
                    }
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Operation(CalculatorOperation.Multiply))
                    }
                )

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(MaterialTheme.colors.onPrimary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(MaterialTheme.colors.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(Action.Operation(CalculatorOperation.Subtract))
                    }
                )

            }

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "1",
                modifier = Modifier
                    .background(MaterialTheme.colors.onPrimary)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Number(1))
                }
            )
            CalculatorButton(
                symbol = "2",
                modifier = Modifier
                    .background(MaterialTheme.colors.primarySurface)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Number(2))
                }
            )
            CalculatorButton(
                symbol = "3",
                modifier = Modifier
                    .background(MaterialTheme.colors.onPrimary)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Number(3))
                }
            )
            CalculatorButton(
                symbol = "+",
                modifier = Modifier
                    .background(MaterialTheme.colors.primary)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Operation(CalculatorOperation.Add))
                }
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "0",
                modifier = Modifier
                    .background(MaterialTheme.colors.onPrimary)
                    .aspectRatio(2f)
                    .weight(2f),
                onClick = {
                    onAction(Action.Number(0))
                }
            )
            CalculatorButton(
                symbol = ".",
                modifier = Modifier
                    .background(MaterialTheme.colors.onPrimary)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Decimal)
                }
            )
            CalculatorButton(
                symbol = "=",
                modifier = Modifier
                    .background(MaterialTheme.colors.primary)
                    .aspectRatio(1f)
                    .weight(1f),
                onClick = {
                    onAction(Action.Calculate)
                }
            )

        }




    }
}
