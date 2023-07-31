require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append="\
 \
  tools-debug \
  debug-tweaks"

IMAGE_INSTALL:append=" libgbm-dev libgles1-mesa-dev libgles2-mesa-dev libgles3-mesa-dev pkgconfig packagegroup-arcadia-apps packagegroup-arcadia-tools "
IMAGE_INSTALL:remove:odroid-xu4=" libgles3-mesa-dev "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

