/*
 * Copyright (C) 2016 Jakub Bogacki, Krystian Drożdżyński
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.kubatatami;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.github.kubatatami.steppers.R;


public class SteppersViewHolder extends RecyclerView.ViewHolder {

    private boolean isChecked;

    protected View itemView;
    protected RoundedView roundedView;
    protected TextView textViewLabel;
    protected TextView textViewSubLabel;
    protected FrameLayout frameLayout;
    protected View viewLineAbove;
    protected View viewLineBottom;

    public SteppersViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        this.roundedView = (RoundedView) itemView.findViewById(R.id.roundedView);
        this.textViewLabel = (TextView) itemView.findViewById(R.id.textViewLabel);
        this.textViewSubLabel = (TextView) itemView.findViewById(R.id.textViewSubLabel);
        this.frameLayout = (FrameLayout) itemView.findViewById(R.id.frameLayout);
        this.frameLayout.setId(ViewIdGenerator.generateViewId());
        this.viewLineAbove = itemView.findViewById(R.id.viewLineAbove);
        this.viewLineBottom = itemView.findViewById(R.id.viewLineBottom);
    }

    /**
     * @return true if step is done, false if not
     */
    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
