inherit core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append="\
  ssh-server-dropbear \
  tools-debug \
  debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL:append=" packagegroup-testapps packagegroup-lldb"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

