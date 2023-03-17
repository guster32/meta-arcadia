require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append="\
 \
  tools-debug \
  debug-tweaks"

IMAGE_INSTALL:append=" mesa libgbm libgbm-dev libgles1-mesa libgles2-mesa libgles3-mesa libgles1-mesa-dev libgles2-mesa-dev libgles3-mesa-dev pkgconfig packagegroup-arcadia-apps packagegroup-arcadia-tools "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

