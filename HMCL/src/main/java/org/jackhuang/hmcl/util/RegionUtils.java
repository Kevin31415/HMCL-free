/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2026 huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.util;

import org.jetbrains.annotations.NotNullByDefault;

@NotNullByDefault
public final class RegionUtils {

    /// Pre-check if the network is in China Mainland to avoid blocking the UI thread.
    public static void init() {
        // No-op: always returns false
    }

    public static boolean isIsChinaMainlandMachine() {
        return false;
    }

    public static boolean isIsChinaMainlandNetwork() {
        return false;
    }

    private RegionUtils() {
    }
}
