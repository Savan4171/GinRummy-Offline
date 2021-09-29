/*
 * Copyright (c) 2015 eSailors IT Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package de.esailors.android.widget.scratch;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

public class CustomScratchPath extends Path {

  private final float referenceWidth;
  private final float referenceHeight;

  public CustomScratchPath(float referenceWidth, float referenceHeight) {

    this.referenceWidth = referenceWidth;
    this.referenceHeight = referenceHeight;
  }

  public Path scale(Rect surfaceFrame) {

    Path scaled = new Path(this);
    Matrix scaleMatrix = new Matrix();
    scaleMatrix.setScale(surfaceFrame.width() / referenceWidth, surfaceFrame.height() / referenceHeight);
    scaled.transform(scaleMatrix);
    return scaled;
  }
}
