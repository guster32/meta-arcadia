SUMMARY = "Basic KMS/DRM/GBM graphics image"
LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL:append=" packagegroup-core-boot glplay "

IMAGE_FEATURES:append=" splash"

IMAGE_INSTALL:append=" mesa libgbm "
IMAGE_INSTALL:append:qemuall=" libgles1-mesa libgles2-mesa libgles3-mesa "
IMAGE_INSTALL:append:odroid-xu4=" wayland htop mali-t62x kmscube ldd "

KERNEL_FEATURES:append:qemuall=" cfg/virtio.scc features/drm-bochs/drm-bochs.scc"
KERNEL_FEATURES:append:qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES:append:qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

