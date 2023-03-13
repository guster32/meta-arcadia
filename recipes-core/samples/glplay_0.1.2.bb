SUMMARY = "GLPlay"
SECTION = "Sample"
LICENSE = "MIT"
HOMEPAGE = "https://github.com/guster32/glplay"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84f20c3b625ccbba2d4fb9c7ba68e9f1"
DEPENDS += " pkgconfig-native mesa libdrm virtual/egl virtual/libgles2 virtual/libgles3 virtual/libgbm"

PACKAGECONFIG[gles3] = "virtual/libgles3"

inherit cmake pkgconfig

TOOLCHAIN = "clang"

SRC_URI += "git://git@github.com/guster32/glplay.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "8bee19861017df1a6089784daa788018d9e2e8e7"
S = "${WORKDIR}/git"

DEBUG_OPTIONS = "-DCMAKE_BUILD_TYPE=DEBUG "
CMAKE_CXX_COMPILER ="-DCMAKE_CXX_COMPILER=/usr/bin/clang++"
CMAKE_C_COMPILER ="-DCMAKE_C_COMPILER=/usr/bin/clang"
EXTRA_OECMAKE = "${@oe.utils.conditional("DEBUG_BUILD", "1", "${CMAKE_CXX_COMPILER} ${CMAKE_C_COMPILER} ${DEBUG_OPTIONS}", "${CMAKE_CXX_COMPILER} ${CMAKE_C_COMPILER}", d)}"

