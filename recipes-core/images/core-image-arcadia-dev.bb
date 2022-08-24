require core-image-arcadia.bb

SUMMARY = "Basic KMS/DRM/GBM graphics image for development"
LICENSE = "MIT"

IMAGE_FEATURES:append=" dev-pkgs"

IMAGE_ROOTFS_EXTRA_SPACE:qemux86-64 = "41943040"
EXTRA_IMAGE_FEATURES:append:qemux86-64="\
      dbg-pkgs \
      tools-debug \
      tools-testapps \
      debug-tweaks \
      tools-sdk \
      dev-pkgs"

IMAGE_INSTALL:append:qemux86-64=" \
  python3 \
  python3-pip \
  python3-six \
  openssh \
  openssh-sftp \
  openssh-sftp-server \
  packagegroup-core-buildessential \
  cmake \
  ninja \
  clang \
  lldb \
  lldb-server \
  valgrind \
  vim \
  git \
  curl \
  wget \
  htop \
  iftop \
  libtool \
  ldd \
  bash \
  coreutils \
  e2fsprogs \
  e2fsprogs-resize2fs \
  e2fsprogs-tune2fs \
  findutils \
  gawk \
  grep \
  less \
  net-tools \
  parted \
  pciutils \
  procps \
  sed \
  util-linux \
  which "

COMPATIBLE_MACHINE = "odroid-xu4|qemuarm|qemux86-64|rockpi-4-rk3399i|jetson-nano-qspi-sd"

